import './App.css';
import Home from './components/Home';
import 'bootstrap/dist/css/bootstrap.min.css';
import NavBar from './components/NavBar';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Edit from './components/Edit';

function App() {
  return (
    <div className="App">   
    
      <BrowserRouter>
       <NavBar/>
        <Routes>
          <Route path='/' element={ <Home/>}></Route>
          <Route path='/edit/:id' element={<Edit/>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
