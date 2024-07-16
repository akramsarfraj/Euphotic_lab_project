import React from 'react'

function NetError() {
    return (
        <div className='NetError'>
            <div class="alert alert-danger">
                <strong>ERR_NETWORK!</strong> Server not runing.
            </div>
        </div>
    )
}

export default NetError