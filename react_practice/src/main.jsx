import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'
import {Provider} from 'react-redux'
import { store ,persistor } from './redux/store.js'
import { CounterProvider } from './context/CounterContext.jsx'
import { PersistGate } from 'redux-persist/integration/react'

ReactDOM.createRoot(document.getElementById('root')).render(
  <PersistGate persistor={persistor}>

    <Provider store= {store}>
      <CounterProvider>    
        <App />
      </CounterProvider>
    </Provider>

  </PersistGate>,
)
