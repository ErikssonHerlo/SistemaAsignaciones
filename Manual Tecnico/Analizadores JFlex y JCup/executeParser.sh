#!/usr/bin/bash
echo "Compilando parser..."
java -jar /home/erikssonherlo/Descargas/java-cup-bin-11b-20160615/java-cup-11b.jar Parser.cup
echo "Parser compilado!"
echo "Copiando parser.java"
cp -i Parser.java /home/erikssonherlo/NetBeansProjects/SistemaAsignaciones/src/main/java/gramatica/
echo "ParserCapas.java copiado!!!"
echo "Copiando sym.java"
cp -i sym.java /home/erikssonherlo/NetBeansProjects/SistemaAsignaciones/src/main/java/gramatica/
echo "sym.java copiado!!!"
