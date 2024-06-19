import React, { useState } from 'react'
import '../styles/Navbar.css'
import { Link } from 'react-router-dom'

function Navbar() {

    const [openLinks, setOpenLinks] = useState(false)

    const toggleNavbar = () => {
        setOpenLinks(!openLinks)
    }

    return (
        <div className='navbar'>
            <div className='leftSide' id={openLinks ? "open" : "close"}>
                <div className="hiddenLinks">
                    <Link to="/">Home</Link>
                    <Link to="/predicted">View Predicted Stats</Link>
                    <Link to="/historic">View Historic Rankings</Link>
                </div>
            </div>
            <div className='rightSide'>
                <Link to="/">Home</Link>
                <Link to="/predicted">View Predicted Stats</Link>
                <Link to="/historic">View Historic Rankings</Link>
                <Link to="/articles">View Latest News</Link>
                <Link to='/historic/ViewAll'>View All Stats</Link>
                <button onClick={toggleNavbar}>Button</button>

            </div>
        </div>
    )
}

export default Navbar