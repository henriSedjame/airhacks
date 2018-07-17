# Build
mvn clean package && docker build -t com.airhacks/hi .

# RUN

docker rm -f hi || true && docker run -d -p 8080:8080 -p 4848:4848 --name hi com.airhacks/hi 