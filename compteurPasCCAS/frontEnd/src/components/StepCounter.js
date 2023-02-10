import '../style/StepCounter.css'
import React, { useState, useEffect } from 'react';

const StepCounter = () => {
  const [stepCount, setStepCount] = useState(0);
  const [unit, setUnit] = useState('pas');
  const [valueToAdd, setValueToAdd] = useState(0);

  useEffect(() => {
    // Récupère la valeur actuelle du compteur de pas à partir de l'API REST
    fetch('http://localhost:8080/api/counter')
      .then(response => response.json())
      .then(data => setStepCount(data.stepCount));
  }, []);

  const handleSave = () => {
    // Enregistre les modifications apportées au compteur de pas dans l'API REST
    fetch('http://localhost:8080/api/counter/steps', {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ stepCount: stepCount + valueToAdd * (unit === 'pas' ? 1 : 600) })
    });
  };

  return (
    <div>
      <p>Nombre de pas: {stepCount}</p>
      <input type="number" value={valueToAdd} onChange={e => setValueToAdd(e.target.value)} />      
      <select value={unit} onChange={e => setUnit(e.target.value)}>
        <option value="pas">Pas</option>
        <option value="kilomètre">Kilomètre</option>
      </select>
      <button onClick={handleSave => setStepCount(stepCount + valueToAdd * (unit === 'pas' ? 1 : 600))}>Enregistrer</button>

    </div>
  );
};

export default StepCounter;
