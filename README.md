# eth-tx-monitor
Monitor Ethereum Transactions

sudo sysctl -w net.ipv6.conf.all.disable_ipv6=1
sudo sysctl -w net.ipv6.conf.default.disable_ipv6=1
kafka/bin/zookeeper-server-start.sh kafka/config/zookeeper.properties
kafka/bin/kafka-server-start.sh kafka/config/server.properties
kafka/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3 --topic test
kafka/bin/kafka-topics.sh --list --bootstrap-server localhost:9092
kafka/bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
kafka/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning