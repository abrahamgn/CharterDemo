# Instructions:
- Install JDK 8
- Run the following commands in root directory:
```
./gradlew clean build
./gradlew bootRun
```
# Sample Request JSON Body - localhost:8080/rest/points
```
[
    {
        "month": "January",
        "amount": "120"
    },
    {
        "month": "January",
        "amount": "300"
    },
    {
        "month": "January",
        "amount": "250"
    },
    {
        "month": "February",
        "amount": "130"
    },
    {
        "month": "December",
        "amount": "180"
    },
    {
        "month": "December",
        "amount": "180"
    },
    {
        "month": "December",
        "amount": "75"
    },
    {
        "month": "December",
        "amount": "120"
    }
]
```
