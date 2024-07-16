import React from 'react'
import "../components/css/NavBar.css"

import NavDrop from './NavDrop'
import { Link } from 'react-router-dom'

function NavBar() {
    return (
        <div className='NavBar'>
            <div>
                <Link to="/" className='dashboard'>
                    <div className='img_logo'>
                        <img src="icons8-food-bar-50.png" alt='logo' />
                        <h4>Dashboard</h4>
                    </div>
                </Link>
                <div className='nav_links'>  
                   <p><Link className='home' to='/'>Home</Link></p>
                </div>
            </div>
            <div className='admin_edit'>
                {/* <img src='icons8-admin-50.png' /> */}
                <NavDrop/>
            </div>
        </div>
    )
}

export default NavBar