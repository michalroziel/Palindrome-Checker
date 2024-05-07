import pandas as pd
import matplotlib.pyplot as plt

# Load the data from the CSV file
data = pd.read_csv('measurements.csv', header=None)

# Assign columns to the data for better readability
data.columns = ['Word Length', 'Iterative Time', 'Recursive Time']

# Plot the data
plt.figure(figsize=(10, 6))
plt.plot(data['Word Length'], data['Iterative Time'], label='Iterative Time')
plt.plot(data['Word Length'], data['Recursive Time'], label='Recursive Time')
plt.xlabel('Word Length')
plt.ylabel('Time (nanoseconds)')
plt.title('Time Comparison between Iterative and Recursive Palindrome Check')
plt.legend()
plt.show()
