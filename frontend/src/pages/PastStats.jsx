import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../styles/PastStats.css';

const API_URL = 'https://nba-premier-stats-a373f9b1c4a8.herokuapp.com';
function PastStats() {
    const [season, setSeason] = useState('');
    const [seasonType, setSeasonType] = useState('');
    const [stat, setStat] = useState('');
    const [topPlayers, setTopPlayers] = useState([]);
    const topFivePlayers = topPlayers.slice(0, 5);
    console.log(topPlayers);

    const seasons = ['2014-15', '2015-16', '2016-17', '2017-18', '2018-19', '2019-20', '2020-21', '2021-22', '2022-23', '2023-24'];
    const seasonTypes = [
        { value: 'Regular', label: 'Regular Season' },
        { value: 'Playoffs', label: 'Playoffs' }
    ];
    const stats = ['Pts', 'Ast', 'Reb', 'Stl', 'Blk', 'Fg3Pct', 'FgPct', 'FtPct', 'Tov']; // Define available stats
    console.log(topFivePlayers);
    useEffect(() => {
        if (season && seasonType && stat) {
            axios.get(`${API_URL}/api/historic/top${stat}?season=${season}&seasonType=${seasonType}`)
                .then(response => {
                    setTopPlayers(response.data); // Assuming response.data is a single player object
                })
                .catch(() => {
                    console.log("Make sure each parameter is set");
                });
        }
    }, [season, seasonType, stat]);

    return (
        <div className="PastStats">
            <label>
                Select Season:
                <select value={season} onChange={e => setSeason(e.target.value)}>
                    <option value="">Select a season</option>
                    {seasons.map(season => (
                        <option key={season} value={season}>
                            {season}
                        </option>
                    ))}
                </select>
            </label>

            <label>
                Select Season Type:
                <select value={seasonType} onChange={e => setSeasonType(e.target.value)}>
                    <option value="">Select a season type</option>
                    {seasonTypes.map(type => (
                        <option key={type.value} value={type.value}>
                            {type.label}
                        </option>
                    ))}
                </select>
            </label>

            <label>
                Select Stat:
                <select value={stat} onChange={e => setStat(e.target.value)}>
                    <option value="">Select a stat</option>
                    {stats.map(stat => (
                        <option key={stat} value={stat}>
                            {stat}
                        </option>
                    ))}
                </select>
            </label>

            <div>
                <h2>
                    Top 5 Players for {stat} in {season} ({seasonType ? seasonType.replace('%20', ' ') : ''}):
                </h2>
                <ul>
                    {topFivePlayers.map((player, index) => (
                        <li key={index}>
                            <p>{index+1}.</p>
                            <p>Player: {player.player}</p>
                            <p>Team: {player.team}</p>
                            <p>Points: {player.pts}</p>
                            <p>Assists: {player['ast']}</p>
                            <p>Rebounds: {player.reb}</p>
                            <p>Steals: {player.stl}</p>
                            <p>Blocks: {player.blk}</p>
                            <p>FG%: {player.fg_Pct}</p>
                            <p>3P%: {player.fg3_Pct}</p>
                            <p>FT%: {player.ft_Pct}</p>
                            <p>Turnovers: {player.tov}</p>
                        </li>
                    ))}
                </ul>
            </div>
        </div>
    );
}

export default PastStats;

