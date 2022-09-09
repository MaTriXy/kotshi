package se.ansman.kotshi

object Errors {
    const val sealedClassMustBePolymorphic = "Sealed classes must be annoted with @Polymorphic"
    const val nestedSealedClassMustBePolymorphic = "Children of a sealed class must be annotated with @Polymorphic"
    const val defaultSealedValueIsGeneric = "The default value of a sealed class cannot be generic"
    const val javaClassNotSupported = "Only Kotlin types are supported"
    const val unsupportedSerializableType = "@JsonSerializable can only be applied to enums, objects, sealed classes and data classes"
    const val privateClass = "Classes annotated with @JsonSerializable must public or internal"
    const val privateDataClassConstructor = "The constructor must be public or internal to use @JsonSerializable on a data class"
    const val polymorphicClassMustHaveJsonSerializable = "Classes annotated with @Polymorphic must also be annotated with @JsonSerializable"
    const val polymorphicSubclassMustHaveJsonSerializable = "Sealed class subclasses must be annotated with @JsonSerializable"
    const val polymorphicSubclassMustHavePolymorphicLabel = "Sealed class subclasses must be annotated with @PolymorphicLabel unless they are sealed classes or are annotated with @JsonDefaultValue"
    const val dataClassCannotBeInner = "@JsonSerializable can't be applied to inner classes"
    const val dataClassCannotBeLocal = "@JsonSerializable can't be applied to local classes"
    const val noSealedSubclasses = "Sealed class has no implementations"
    const val multipleJsonDefaultValueInEnum = "Only one enum entry can be annotated with @JsonDefaultValue"
    const val multipleJsonDefaultValueInSealedClass = "Only one sealed subclass can be annotated with @JsonDefaultValue"
    const val jsonDefaultValueAppliedToInvalidType = "@JsonDefaultValue can only be applied to enum entries, data classes and objects"
    const val nestedSealedClassHasPolymorphicLabel = "Children of a sealed class with the same label key must not be annotated with @PolymorphicLabel"
    const val nestedSealedClassMissingPolymorphicLabel = "Children of a sealed class with a different label key must be annotated with @PolymorphicLabel"
    const val unsupportedFactoryType = "@KotshiJsonAdapterFactory can only be applied to objects, interfaces and abstract classes"
    const val invalidRegisterAdapterType = "Only objects and non abstract classes can be annotated with @RegisterJsonAdapter"
    const val invalidRegisterAdapterVisibility = "Types annotated @RegisterJsonAdapter must be public or internal"
    const val abstractFactoriesAreDeprecated = "Having abstract factories is deprecated and will be removed in the future. Please migrate to use objects with delegation to the generated factory."
    const val registeredAdapterWithoutFactory = "Found classes annotated with @RegisterJsonAdapter but no factory annotated with @KotshiJsonAdapterFactory"
    fun privateDataClassProperty(propertyName: String) = "Property $propertyName must be public or internal"
    fun transientDataClassPropertyWithoutDefaultValue(propertyName: String) = "Transient property $propertyName must declare a default value"
    fun ignoredDataClassPropertyWithoutDefaultValue(propertyName: String) = "Ignored property $propertyName must declare a default value"
    fun nonIgnoredDataClassPropertyMustNotBeTransient(propertyName: String) = "Property $propertyName cannot have ignore = false and @Transient"
    fun sealedSubclassMustNotHaveGeneric(typeVariableName: String) = "Could not determine type of type variable $typeVariableName. This can happen when sealed subclasses have type variables that are not present in all superclasses."
    fun multipleFactories(names: List<String>) = "Multiple classes found with annotations @KotshiJsonAdapterFactory: ${names.sorted().joinToString()}"
    fun invalidGeneratedAnnotation(name: String): String =
        "Invalid value $name for option ${Options.generatedAnnotation}. Possible values are ${Options.possibleGeneratedAnnotations.keys.joinToString()}"
}