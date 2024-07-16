
import React from 'react'
import { Dropdown } from 'react-bootstrap'

function NavDrop() {
  return (
    <div className="drop">
       <Dropdown>
      <Dropdown.Toggle variant="link" id="dropdown-basic">
       <img src='icons8-admin-50.png' />
      </Dropdown.Toggle>

      <Dropdown.Menu>
        <Dropdown.Item href="#/action-1">Home</Dropdown.Item>
        <Dropdown.Item href="#/action-2">Edit</Dropdown.Item>
      </Dropdown.Menu>
    </Dropdown>
  </div>
  )
}

export default NavDrop