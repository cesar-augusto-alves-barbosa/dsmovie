import axios from "axios";
import { useEffect, useState } from "react";
import MovieCard from "../../components/MovieCard";
import Pagination from "../../components/Pagination";
import { MoviePage } from "../../types/movie";
import { BASE_URL } from "../../utils/request";

function Listing() {

    const [pageNumber, setPageNumber] = useState(0);

    useEffect(() => {
        axios.get(`${BASE_URL}/movies`)
        .then(res => {
            const data = res.data as MoviePage;
            setPageNumber(data.number)
        })
    }, [])

    return (
        <>
            <Pagination />
            <div className="container">
                <div className="row">
                    <div className="col-sm-6 col-lg-4 col-xlg-3 mb-4">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xlg-3 mb-4">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xlg-3 mb-4">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xlg-3 mb-4">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xlg-3 mb-4">
                        <MovieCard />
                    </div>
                </div>
            </div>
        </>
    );
}

export default Listing;