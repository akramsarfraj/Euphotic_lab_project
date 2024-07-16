import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'

function Edit() {
    let dishID = useParams();
    let [edit, setEdit] = useState({})
    let [publish, setpub] = useState("");
    useEffect(() => {
        axios.get(`http://localhost:8080/euphoticlab/dishes_api/${dishID.id}`)
            .then((res) => {

                setEdit(res.data)
            })
            .catch((err) => {
                console.log(err);
            })
    }, [])

    let setPublish = () => {
        if (publish !== "") {
            axios.post(`http://localhost:8080/euphoticlab/dishes_api/${dishID.id}?setPublish=${publish}`)
                .then((res) => {
                    alert(res.data)
                })
                .catch((err) => {
                    console.log(err);
                })
        }
    }
    console.log(publish);

    return (
        <div className='edit_page' style={{ display: "flex", justifyContent: "center" }}>

            <div className='form' style={{ width: "400px", margin: "30px" }}>
                <img className="card-img-top" src={edit.imageUrl} alt="Card image" style={{ width: "100%", height: "300px", borderRadius: "10px" }} />


                <label for="name">DishName</label>
                <input type="text" className="form-control" value={edit.dishName} disabled id="name" />

                <label for="published">Set published</label>
                <select class="form-control" value={publish} onChange={(e) => { setpub(e.target.value) }} id="published">
                    {
                        edit.published === true ? <>
                            <option value="publish">Published</option>
                            <option value="Unpublished">UnPublished</option>

                        </> : <>
                            <option value="Unpublished">UnPublished</option>
                            <option value="publish">Published</option>
                        </>
                    }

                </select>

                <button className='btn btn-primary' style={{ marginTop: "5px" }} onClick={setPublish}>Save</button>

            </div>

        </div >
    )
}

export default Edit