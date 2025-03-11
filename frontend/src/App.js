import React, { useState } from 'react';
import './App.css';

function App() {
  const [text, setText] = useState('');
  const [tokens, setTokens] = useState([]);
  const [symbolTable, setSymbolTable] = useState([]);

  const handleAnalyze = () => {
    // Aquí puedes agregar la lógica para analizar el texto
    const fakeTokens = ['Token1', 'Token2', 'Token3']; // Ejemplo de tokens generados
    const fakeSymbolTable = [
      { symbol: 'A', value: 1 },
      { symbol: 'B', value: 2 },
    ]; // Ejemplo de tabla de símbolos

    setTokens(fakeTokens);
    setSymbolTable(fakeSymbolTable);
  };

  return (
    <div className="App">
      <h1>INGRESE EL TEXTO A ANALIZAR</h1>

      {/* Cuadro de texto */}
      <textarea
        value={text}
        onChange={(e) => setText(e.target.value)}
        placeholder="Escribe tu texto aquí..."
        rows={10}
        cols={50}
      />

      {/* Botón ANALIZAR */}
      <button onClick={handleAnalyze}>ANALIZAR</button>

      {/* Sección de resultados */}
      <div className="results">
        {/* Tokens generados */}
        <div className="tokens">
          <h2>TOKENS GENERADOS</h2>
          <ul>
            {tokens.map((token, index) => (
              <li key={index}>{token}</li>
            ))}
          </ul>
        </div>

        {/* Tabla de símbolos */}
        <div className="symbol-table">
          <h2>TABLA DE SIMBOLOS</h2>
          <table>
            <thead>
              <tr>
                <th>Símbolo</th>
                <th>Valor</th>
              </tr>
            </thead>
            <tbody>
              {symbolTable.map((entry, index) => (
                <tr key={index}>
                  <td>{entry.symbol}</td>
                  <td>{entry.value}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>

      {/* Espacios para imágenes */}
      <div className="images">
      <div className="image-placeholder">
        <img src="/rarity.PNG" alt="Florecita" />
      </div>
      <div className="image-placeholder">
        <img src="/otra imagen.PNG" alt="Otra imagen" />
        </div>
        </div>
    </div>
    
  );
}

export default App;
