import React, { useState } from "react";
import axios from "axios";
import '../styles/HistoricViewAll.css';

const API_URL = 'https://nba-premier-stats-a373f9b1c4a8.herokuapp.com';
function HistoricViewAll() {
    const [view, setView] = useState(null);
    const [isLoading, setIsLoading] = useState(false);

    const fetchData = () => {
        setIsLoading(true);
        axios.get(`${API_URL}/api/historic/ViewAll`)
            .then(response => {
                setView(response.data);
                setIsLoading(false);
            })
            .catch(error => {
                console.error("Error fetching data:", error);
                setIsLoading(false);
            });
    };

    return (
        <div className="view-all">
            <button onClick={fetchData}>View All Past Data</button>
            {isLoading && <p>Loading data...</p>}
            {view ? (
                <div className="data-table">
                    <table>
                        <thead>
                        <tr>
                            <th>Player</th>
                            <th>Year</th>
                            <th>Team</th>
                            <th>Points</th>
                            <th>Assists</th>
                            <th>Rebounds</th>
                            <th>Steals</th>
                            <th>Blocks</th>
                            <th>FG%</th>
                            <th>3P%</th>
                            <th>FT%</th>
                            <th>Turnovers</th>
                        </tr>
                        </thead>
                        <tbody>
                        {view.map((player, index) => (
                            <tr key={index}>
                                <td>{player.player}</td>
                                <td>{player['year']}</td>
                                <td>{player.team}</td>
                                <td>{player.pts}</td>
                                <td>{player['ast']}</td>
                                <td>{player.reb}</td>
                                <td>{player.stl}</td>
                                <td>{player.blk}</td>
                                <td>{player.fg_Pct}</td>
                                <td>{player.fg3_Pct}</td>
                                <td>{player.ft_Pct}</td>
                                <td>{player.tov}</td>
                            </tr>
                        ))}
                        </tbody>
                    </table>
                </div>
            ) : (
                !isLoading && <p>No data available. Click the button to fetch data.</p>
            )}
        </div>
    );
}

export default HistoricViewAll;
