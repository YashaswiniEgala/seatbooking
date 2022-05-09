import React, { Component } from 'react';
 
  class App extends Component {
  
   constructor() {
        super();
 
        this.state = {
            Location: ''
        };
      this.onRadioChange = this.onRadioChange.bind(this);
      this.onSubmit = this.onSubmit.bind(this);
    }
    onRadioChange = (e) => {
      this.setState({
        location: e.target.value
      });
    }
 
    onSubmit = (e) => {
      e.preventDefault();
      console.log(this.state);
    }
  render() {
    return (
    <div className="App">
      <form onSubmit={this.onSubmit}>
      <strong>Select Location:</strong>
 
      <ul>
        <li>
        <label>
        <input type="radio" value="Bnglr" checked={this.state.Location=== "Bnglr"} onChange={this.onRadioChange} />
        <span>Bnglr</span>
        </label>
        </li>

        <li>
        <label>
        <input type="radio" value="Hyd" checked={this.state.Location=== "Hyd"} onChange={this.onRadioChange} />
        <span>Hyd</span>
        </label>
        </li>
        </ul>
 
      <button type="submit">Submit</button>
      </form>
    </div>
    );
  }
}
export default App