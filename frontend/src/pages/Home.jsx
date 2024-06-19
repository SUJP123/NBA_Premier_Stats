import React from 'react'
import '../styles/Home.css'
import { Link } from 'react-router-dom'
import NBA_logo from '../assets/NBA_logo.png'

function Home() {
    return (
        <div className='home' style={{ backgroundImage: `url(${NBA_logo})` }}>
                <div className="headerContainer">
                    <h1>NBA Premier Stats</h1>
                    <p> The Ultimate Site for All things NBA</p>
                    <Link to='/historic'>
                        <button className={'btn1'}>Past Rankings</button>
                    </Link>
                    <Link to='/predicted'>
                        <button className={'btn2'}>Predict Stats</button>
                    </Link>
                    <Link to='/articles'>
                        <button className={'btn3'}>Latest News</button>
                    </Link>
                    <Link to='/historic/ViewAll'>
                        <button className={'btn4'}>View All Stats</button>
                    </Link>
                </div>
        </div>
    )
}

export default Home