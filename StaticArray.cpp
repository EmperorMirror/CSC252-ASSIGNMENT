#include <iostream>
using namespace std;

int main() {
    // Declare a static array of size 10
    int arr[10];

    // Populate the array with user input
    cout << "Enter 10 integers:" << endl;
    for (int i = 0; i < 10; i++) {
        cin >> arr[i];
    }

    // Print all values in the array
    cout << "You entered:" << endl;
    for (int i = 0; i < 10; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
