import React , {useState} from 'react'
import { createContext } from 'react'

export const CounterContext = createContext({});

export function CounterProvider({children}) {
    const [counter, setCounter] = useState(0);
    const updateCounter = (counter)=>{
        setCounter(counter);
    }
    const incrementCounter = ()=>{
        setCounter(counter+1)
    }
    const decrementCounter = ()=>{
        setCounter(counter-1)
    }
    return (
        <CounterContext.Provider value= {{counter, updateCounter, incrementCounter, decrementCounter}}>
            {children}
        </CounterContext.Provider>
    )
}
