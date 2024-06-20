import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../styles/PredictedStats.css'

const API_URL = 'https://nba-premier-stats-a373f9b1c4a8.herokuapp.com';
function PredictedStats() {
    const [player, setPlayer] = useState('');
    const [playerData, setPlayerData] = useState(null);

    useEffect(() => {
        if (player) {
            const formattedPlayer = player.replace(/\s+/g, '_');
            console.log(formattedPlayer);
            axios.get(`${API_URL}/api/predictions/player?playerName=${formattedPlayer}`)
                .then(response => {
                    setPlayerData(response.data); // Assuming response.data is a single player object
                })
                .catch(error => {
                    console.error(error);
                });
        }
    }, [player]);

    const handleSubmit = (e) => {
        e.preventDefault();
        const playerName = e.target.elements.playerName.value;
        setPlayer(playerName);
    };

    return (
        <div className="Predict">
            <h1>Stats Predictor for the 2024-25 season</h1>
            <p>Type any active NBA player's name below</p>
            <form onSubmit={handleSubmit}>
                <label>
                    Enter Player Name:
                    <input type="text" name="playerName" />
                </label>
                <button type="submit">Get Predicted Stats</button>
            </form>

            {playerData && (
                <div className={'stats'}>
                    <h2>Predicted Stats for {playerData.player.replace('_', ' ')} for the 2024-25 Season</h2>
                    <p>Points: {playerData.pts}</p>
                    <p>Assists: {playerData['ast']}</p>
                    <p>Rebounds: {playerData.reb}</p>
                    <p>Steals: {playerData.stl}</p>
                    <p>Blocks: {playerData.blk}</p>
                </div>
            )}
        </div>
    );
}

export default PredictedStats;
