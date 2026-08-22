// Enhance all arrays with a .last() method
Array.prototype.last = function() {
    if (this.length === 0) {
        return -1;   // If array is empty
    }
    return this[this.length - 1];  // Return last element
};

