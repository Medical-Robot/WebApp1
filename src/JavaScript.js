/* Firebase configuration
const firebaseConfig = {
    apiKey: "YOUR_API_KEY",
    authDomain: "YOUR_AUTH_DOMAIN",
    projectId: "YOUR_PROJECT_ID",
    storageBucket: "YOUR_STORAGE_BUCKET",
    messagingSenderId: "YOUR_MESSAGING_SENDER_ID",
    appId: "YOUR_APP_ID"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);

// Initialize Firestore
const db = firebase.firestore();

// Reference to the records collection
const recordsRef = db.collection('records');

// Function to update the table with data from Firestore
function updateTable(snapshot) {
    const tbody = document.querySelector('#dataTable tbody');
    tbody.innerHTML = ''; // Clear existing rows
    snapshot.forEach(doc => {
        const record = doc.data();
        const row = document.createElement('tr');
        row.innerHTML = `<td>${record.number}</td><td>${record.data}</td>`;
        tbody.appendChild(row);
    });
}

// Listen for real-time updates
recordsRef.orderBy('number').onSnapshot(updateTable);

// Establish WebSocket connection
const socket = new WebSocket('ws://localhost:8080'); // Replace with your WebSocket URL

// Function to update the table with a new string
function updateTableWithString(newString) {
    // Clear existing table body
    const tableBody = document.querySelector('#dataTable tbody');
    tableBody.innerHTML = '';

    // Create new table row with the new string
    const row = document.createElement('tr');
    row.innerHTML = `<td>${newString}</td>`;
    tableBody.appendChild(row);
}

// Listen for messages from WebSocket
socket.addEventListener('message', function (event) {
    const newString = event.data; // Assuming the received data is a string
    updateTableWithString(newString);
});*/
