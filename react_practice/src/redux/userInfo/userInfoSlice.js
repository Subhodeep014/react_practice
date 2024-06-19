import {createSlice} from '@reduxjs/toolkit'
const initialState = {
    currentUserInfo : null,
}

const userInfoSlice = createSlice({
    name: 'userInfo',
    initialState,
    reducers : {
        storeUserInfo : (state, action)=>{
            state.currentUserInfo = action.payload;
        }
    }

})

export const {storeUserInfo} = userInfoSlice.actions;
export default userInfoSlice.reducer;