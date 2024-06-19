import { configureStore, combineReducers } from "@reduxjs/toolkit";

import userInfoReducer from './userInfo/userInfoSlice'
import themeReducer from './theme/themeSlice'
import {persistReducer, persistStore} from 'redux-persist'
import storage from 'redux-persist/lib/storage'
const rootReducer = combineReducers({
    userInfo : userInfoReducer,
    theme : themeReducer,
})

const persistConfig = {
    key: 'root',
    storage,
    version: 1,

}

const persistedReducer = persistReducer(persistConfig, rootReducer)
export const store  = configureStore({
    reducer : persistedReducer,
    middleware : (getDefaultMiddleware) =>{
        return getDefaultMiddleware({
            serializableCheck: false
        })
    }
})
export const persistor = persistStore(store)