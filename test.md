##Test
Before you working on this project (palindrome), please answer this question by choosing which statement that produce `Runtime error exception`.


```java

	public class DataSource {}

	public class NetworkDataSource extends DataSource {}

	public class DiskDataSource extends DataSource{}

	public class MemoryDataSource extends DataSource{}


```

+
```java

NetworkDataSource networkDataSource = new NetworkDataSource();
DataSource dataSource = (DataSource) networkDataSource;

```

+
```java

MemoryDataSource memoryDataSource = new MemoryDataSource();
DataSource dataSource = (DataSource) memoryDataSource;
DiskDataSource diskDataSource = (DiskDataSource) dataSource;


```

+
```java

MemoryDataSource memoryDataSource = new MemoryDataSource();
DiskDataSource diskDataSource = (MemoryDataSource) memoryDataSource;

```

+
```java

DataSource dataSource = new DataSource();
NetworkDataSource networkDataSource = (NetworkDataSource) dataSource;

```