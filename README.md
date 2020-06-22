# RxJava: Reactive Extensions for the JVM

<a href='https://travis-ci.org/ReactiveX/RxJava/builds'><img src='https://travis-ci.org/ReactiveX/RxJava.svg?branch=3.x'></a>
[![codecov.io](http://codecov.io/github/ReactiveX/RxJava/coverage.svg?branch=3.x)](https://codecov.io/gh/ReactiveX/RxJava/branch/3.x)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.reactivex.rxjava3/rxjava/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.reactivex.rxjava3/rxjava)

RxJava is a Java VM implementation of [Reactive Extensions](http://reactivex.io): a library for composing asynchronous and event-based programs by using observable sequences.

It extends the [observer pattern](http://en.wikipedia.org/wiki/Observer_pattern) to support sequences of data/events and adds operators that allow you to compose sequences together declaratively while abstracting away concerns about things like low-level threading, synchronization, thread-safety and concurrent data structures.

#### Version 3.x ([Javadoc](http://reactivex.io/RxJava/3.x/javadoc/))

- single dependency: [Reactive-Streams](https://github.com/reactive-streams/reactive-streams-jvm)  
- Java 8+ ([Android](https://github.com/ReactiveX/RxAndroid) desugar friendly)
- Java 8 lambda-friendly API
- fixed API mistakes and many limits of RxJava 2
- intended to be a replacement for RxJava 2 with relatively few binary incompatible changes
- non-opinionated about the source of concurrency (threads, pools, event loops, fibers, actors, etc.)
- async or synchronous execution
- virtual time and schedulers for parameterized concurrency
- test and diagnostic support via test schedulers, test consumers and plugin hooks

### Library reference resources:
1. RxJava2: https://github.com/amitshekhariitbhu/RxJava2-Android-Samples
2. MVVM: https://www.journaldev.com/20292/android-mvvm-design-pattern
3. Room: https://developer.android.com/topic/libraries/architecture/room.html
