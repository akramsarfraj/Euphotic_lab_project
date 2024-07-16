import React from 'react'
import { Link } from 'react-router-dom'

function Dishes({dishes}) {
    let image
    if(dishes.published){
       image = dishes.imageUrl
    }else{
       image = "white-blurred.avif"
    }

    return (
        <div className="card" style={{ width: "400px" }}>

            <img className="card-img-top" src={image} alt="Card image" style={{width: "100%", height: "300px"}} />
            {
                dishes.published === true ? <></> : <p className='img_text'>UnPublished</p> 
            }
            
            <div className="card-body">
                <h4 className="card-title">{dishes.dishName}</h4>
                <Link to={`/edit/${dishes.dishId}`} className="btn btn-primary btn-sm">Edit</Link>
            </div>
        </div>
    )
}

export default Dishes