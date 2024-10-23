import { useEffect, useState } from "react"

export function useFetch(url) {
    console.log(url);
    const [data, setData] = useState("")

    useEffect(() => {
        async function getCep() {
            const response = await fetch(url)
            const dataJson = await response.json()
            setData(dataJson)
            }

            if(url !== null) {
                getCep()
            }
    
    }, [url])

    return [data]
}