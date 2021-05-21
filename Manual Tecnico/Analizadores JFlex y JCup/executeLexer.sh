#!/usr/bin/bash
echo "Compilando lexer..."
jflex Lexer.jflex
echo "Lexer compilado!"
echo "Copiando LexerCapas.java"
cp -i Lexer.java /home/erikssonherlo/NetBeansProjects/SistemaAsignaciones/src/main/java/gramatica/
echo "LexerCapas.java copiado!!!"
