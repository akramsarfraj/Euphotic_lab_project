import React, { useEffect, useState } from 'react'
import '../components/css/Home.css'
import axios from 'axios'
import { Link } from 'react-router-dom'
import Dishes from './Dishes'
import NetError from './NetError'

function Home() {
  let [data, setData] = useState([])

  useEffect(() => {
    axios.get("http://localhost:8080/euphoticlab/dishes_api")
      .then((res) => {
        console.log(res);
        setData(res.data)
      })
      .catch((err) => {
        console.log(err);
      })


  }, [])
  console.log(data);

  return (
    <div className='home_page'>
      {data.length ===0 ? <NetError/>:<></>}
      
      <div className='dishes_container'>

      
      {
        data.map((dishes) => {
          return (
            <Dishes dishes={dishes}/>
          )
        })
      }
  
    </div>

    </div>
  )
}

export default Home