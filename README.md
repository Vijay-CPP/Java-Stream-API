# Java Stream API Overview

The Java Stream API, introduced in Java 8, allows for functional-style operations on streams of elements. It provides a powerful and expressive way to process collections of data.

## Key Concepts and Components

### Stream
**Description**: A sequence of elements supporting sequential and parallel aggregate operations.

**Creation**:
- From Collections: `stream()`, `parallelStream()`
- From Arrays: `Arrays.stream(array)`
- From Other Sources: `Stream.of()`, `Stream.generate()`, `Stream.iterate()`

### Intermediate Operations
**Description**: Operations that transform a stream into another stream. These operations are lazy and do not get executed until a terminal operation is performed.

**Examples**:
- `filter(Predicate<? super T> predicate)`
- `map(Function<? super T, ? extends R> mapper)`
- `flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`
- `distinct()`
- `sorted()`
- `peek(Consumer<? super T> action)`
- `limit(long maxSize)`
- `skip(long n)`

### Terminal Operations
**Description**: Operations that produce a result or a side-effect. These operations trigger the processing of the stream pipeline.

**Examples**:
- `forEach(Consumer<? super T> action)`
- `collect(Collector<? super T, A, R> collector)`
- `reduce(BinaryOperator<T> accumulator)`
- `toArray()`
- `min(Comparator<? super T> comparator)`
- `max(Comparator<? super T> comparator)`
- `count()`
- `anyMatch(Predicate<? super T> predicate)`
- `allMatch(Predicate<? super T> predicate)`
- `noneMatch(Predicate<? super T> predicate)`
- `findFirst()`
- `findAny()`

### Collectors
**Description**: Utility class providing implementations of various reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc.

**Examples**:
- `Collectors.toList()`
- `Collectors.toSet()`
- `Collectors.toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper)`
- `Collectors.groupingBy(Function<? super T, ? extends K> classifier)`
- `Collectors.partitioningBy(Predicate<? super T> predicate)`
- `Collectors.joining(CharSequence delimiter)`

### Parallel Streams
**Description**: A parallel stream divides the content into multiple chunks and processes each chunk with a different thread.

**Creation**:
- From Collections: `parallelStream()`
- From Streams: `stream().parallel()`

### Exception Handling in Streams
**Description**: Best practices for handling exceptions within streams, such as using wrappers and rethrowing exceptions.# Java-Stream-API
