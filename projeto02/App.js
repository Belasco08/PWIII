import  React from 'react';
import { View, Text, Image } from 'react-native';

export default function App() {
  let jobs = ''
  return (
    <View style={styles.container}>
      <Text>Primeiro texto</Text>
     <Text style={{color: 'red', fontSize: 32}}>Segundo Texto</Text>
     <Image
      source={{ uri:jobs}}
      style={{ width: 300, height: 300}}/>
    </View>
    
  );
}

