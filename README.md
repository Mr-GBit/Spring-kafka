# Spring-kafka


Kafka broker contain the Topic

Partition is where the message lives inside the topic. It is an ordered, immutable sequence of records.
Each record is assigned a sequential number called offset.
Each partition is independent of each other.

Topic is compose of partitions

port 2181

1. Start up the Zookeeper

zookeeper-server-start.bat ..\..\config\zookeeper.properties

2. Add the below properties in the server.properties

listeners=PLAINTEXT://localhost:9092
auto.create.topics.enable=false

3. Start up the Kafka Broker

kafka-server-start.bat ..\..\config\server.properties


4. How to create a topic ?

kafka-topics.bat --create --topic message-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4

5. How to instantiate a Console Producer?

a. Without Key

   kafka-console-producer.bat --broker-list localhost:9092 --topic test-topic
   
b. With Key

kafka-console-producer.bat --broker-list localhost:9092 --topic test-topic --property "key.separator=-" --property "parse.key=true"   
   
6. How to instantiate a Console Consumer?

a. Without Key

   kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning

b. With Key

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning -property "key.separator= - " --property "print.key=true"
   
   
===================


1. List the topics in a cluster

kafka-topics.bat --bootstrap-server localhost:9092 --list
kafka-topics.sh --bootstrap-server localhost:9092 --list
