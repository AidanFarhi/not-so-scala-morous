# The Scala type family tree

```

                        Any
                        / \
                    AnyVal AnyRef
                  /              \
            - Double              - All reference types
            - Float               - All user defined type
            - Long                - If using JRE, equals java.lang.Object
            - Int
            - Short
            - Byte
            - Char
            - Unit -> exacly one instance.
            - Boolean

```