import pandas as pd
import sys

# Get the file name from the command line arguments
file_name = sys.argv[1]


# Load the data from the CSV file
data = pd.read_csv(file_name, header=None)

# Assign columns to the data for better readability
data.columns = ['Word Length', 'Iterative Time', 'Recursive Time']

# Sort the data by 'Word Length'
data = data.sort_values(by='Word Length')

# Write the sorted data back to the CSV file
data.to_csv(file_name, index=False, header=False)