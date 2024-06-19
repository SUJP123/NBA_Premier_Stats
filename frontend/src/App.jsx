import './styles/App.css'
import Home from './pages/Home.jsx'
import Footer from './components/Footer.jsx'
import PastStats from'./pages/PastStats.jsx'
import PredictedStats from './pages/PredictedStats.jsx'
import { BrowserRouter as Router, Route, Routes } from "react-router-dom"
import Navbar from "./components/Navbar.jsx";
import LatestNews from "./pages/LatestNews.jsx";
import HistoricViewAll from "./pages/HistoricViewAll";

function App() {

    return (
        <>
            <div className='App'>
                <Router>
                    <Navbar />
                    <Routes>
                        <Route exact path='/' element={<Home />} />
                        <Route exact path='/predicted' element={<PredictedStats />} />
                        <Route exact path='/historic' element={<PastStats />} />
                        <Route exact path="/articles" element={<LatestNews />} />
                        <Route exact path='/historic/ViewAll' element={<HistoricViewAll />} />
                    </Routes>
                    <Footer></Footer>
                </Router>
            </div>

        </>
    )
}

export default App;