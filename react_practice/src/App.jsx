import { useContext, useState } from 'react';
import './App.css';
import { CounterContext } from './context/CounterContext';
import { useDispatch, useSelector } from 'react-redux';
import { storeUserInfo } from './redux/userInfo/userInfoSlice';
import { userTheme } from './redux/theme/themeSlice';

function App() {
  const dispatch = useDispatch();
  const { counter, updateCounter, incrementCounter, decrementCounter } = useContext(CounterContext);
  const [data, setData] = useState({
    fullname: '',
    username: '',
  });

  const handleSubmit = () => {
    dispatch(storeUserInfo(data));
  };

  const { currentUserInfo } = useSelector((state) => state.userInfo);
  const { theme } = useSelector((state) => state.theme);

  const handleTheme = () => {
    const newTheme = theme !== 'dark' ? 'dark' : 'light';
    dispatch(userTheme(newTheme));
  };

  return (
    <>
      <div className={`${theme === 'dark' ? 'bg-gray-800' : 'bg-white'} text-3xl font-bold text-black flex items-center justify-center min-h-screen flex-col gap-2 `}>
        <button onClick={handleTheme} className='bg-sky-500 text-white rounded-md p-3'>
          Theme Change - {theme}
        </button>
        {counter}
        <div>
          Fullname value : {currentUserInfo?.fullname}
          <br />
          Username : {currentUserInfo?.username}
        </div>
        <div className="flex gap-2">
          <div className="">
            <button className='bg-cyan-500 p-4 text-white no-underline hover:no-underline focus:no-underline rounded-md' onClick={incrementCounter}>
              Add by 1
            </button>
          </div>
          <div className=''>
            <button className='bg-cyan-500 p-4 text-white no-underline hover:no-underline focus:no-underline rounded-md' onClick={decrementCounter}>
              Subtract by 1
            </button>
          </div>
        </div>
        <div className="mt-4 flex flex-col gap-2 md:flex-row justify-center">
          <input
            type="text"
            onChange={(e) => setData({ ...data, fullname: e.target.value })}
            className='border border-gray-300 p-2 text-black placeholder-gray-500 rounded-md focus:outline-none focus:ring-2 focus:ring-purple-600 w-full md:w-1/3'
            placeholder='Full Name'
          />
          <input
            type="text"
            onChange={(e) => setData({ ...data, username: e.target.value })}
            className='border border-gray-300 p-2 text-black placeholder-gray-500 rounded-md focus:outline-none focus:ring-2 focus:ring-purple-600 w-full md:w-1/3'
            placeholder='Username'
          />
        </div>
        <div className="">
          <button type='submit' onClick={handleSubmit} className='bg-sky-500 text-white rounded-md p-3'>Submit</button>
        </div>
      </div>
    </>
  );
}

export default App;
