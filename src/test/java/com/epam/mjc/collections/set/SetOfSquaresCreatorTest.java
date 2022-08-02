package com.epam.mjc.collections.set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetOfSquaresCreatorTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptySourceList",
                        List.of(),
                        2,
                        30,
                        Set.of()),

                Arguments.of("WithSquaresFromAndNotFromRange",
                        List.of(-1, 5, 3, -3, 6, -7, -4, 2),
                        2,
                        30,
                        Set.of(25, 9, 16, 4)),

                Arguments.of("WithSquaresOnTheRangeBounds",
                        List.of(-1, 5, 3, -3, 6, -7, -4, 2),
                        4,
                        25,
                        Set.of(4, 9, 16))
        );
    }

    @ParameterizedTest(name = "createSubsetOfSquares_{0}_Test")
    @MethodSource(value = "testCases")
    void createSubsetOfSquares(String name,
                               List<Integer> sourceList,
                               int lowerBound,
                               int upperBound,
                               Set<Integer> expectedSubset) {

        SubsetOfSquaresCreator subsetOfSquaresCreator = new SubsetOfSquaresCreator();
        Set<Integer> actualSubset = subsetOfSquaresCreator.createSubsetOfSquares(sourceList, lowerBound, upperBound);
        assertEquals(expectedSubset, actualSubset);
    }

    @Test
    void testSubsetMethodCalledTest() throws IOException {
        Path filePath = Path.of("src/main/java/com/epam/mjc/collections/set/SubsetOfSquaresCreator.java");
        String source = Files.readString(filePath);
        assertTrue(source.contains(".subSet("));
    }
}