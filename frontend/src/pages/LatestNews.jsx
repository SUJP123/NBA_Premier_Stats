import React, { useState } from 'react';
import axios from 'axios';
import '../styles/LatestNews.css';

function LatestNews() {
    const [articles, setArticles] = useState([]);
    const [source, setSource] = useState('');
    const [player, setPlayer] = useState('');
    const [team, setTeam] = useState('');
    const [limit, setLimit] = useState('');
    const [noArticles, setNoArticles] = useState(false);

    const sources = [
        { value: 'nba', label: 'NBA' },
        { value: 'nba-canada', label: 'NBA Canada' },
        { value: 'espn', label: 'ESPN' },
        { value: 'bleacher-report', label: 'Bleacher Report' },
        { value: 'slam', label: 'Slam' },
        { value: 'yahoo', label: 'Yahoo' }
    ];

    const fetchArticles = () => {
        let url = `/api/articles`;
        let params = [];

        if (source) params.push(`source=${source}`);
        if (player) params.push(`player=${player}`);
        if (team) params.push(`team=${team}`);
        if (limit) params.push(`limit=${limit}`);

        if (params.length) {
            url += `?${params.join('&')}`;
        }

        axios.get(url)
            .then(response => {
                setArticles(response.data);
                setNoArticles(response.data.length === 0);
            })
            .catch(error => {
                console.log("Error fetching articles:", error);
                setNoArticles(true);
            });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        fetchArticles();
    };

    return (
        <div className="LatestArticles">
            <form onSubmit={handleSubmit}>
                <div className="select-container">
                    <label>
                        Source:
                        <select value={source} onChange={e => setSource(e.target.value)}>
                            <option value="">Leave blank</option>
                            {sources.map(source => (
                                <option key={source.value} value={source.value}>
                                    {source.label}
                                </option>
                            ))}
                        </select>
                    </label>
                </div>
                <label>
                    Player:
                    <input type="text" value={player} onChange={e => setPlayer(e.target.value)} />
                </label>
                <label>
                    Team:
                    <input type="text" value={team} onChange={e => setTeam(e.target.value)} />
                </label>
                <label>
                    Limit:
                    <input type="number" value={limit} onChange={e => setLimit(e.target.value)} />
                </label>
                <button type="submit">Fetch Articles</button>
            </form>

            <div className="articles">
                {noArticles ? (
                    <p>No articles found. Please try different search criteria.</p>
                ) : (
                    articles.map((article, index) => (
                        <div key={index} className="article">
                            <h3>{article.title}</h3>
                            <p>{article.description}</p>
                            <a href={article.url} target="_blank" rel="noopener noreferrer">Read more</a>
                        </div>
                    ))
                )}
            </div>
        </div>
    );
}

export default LatestNews;

