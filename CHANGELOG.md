# Next version (unreleased)

# Version 0.0.6

**⚠️Breaking change**: Version `0.7.0` bumps `kotlinx-datetime` to `0.7.0`⚠️

If you were mapping custom scalars to `kotlinx.datetime.Instant`, you now need to map them to `kotlin.time.Instant` and use `KotlinInstantAdapter` (instead of `KotlinxInstantAdapter` before).

You can read more in the kotlinx-datetime repo: https://github.com/Kotlin/kotlinx-datetime?tab=readme-ov-file#deprecation-of-instant

Many thanks to @ychescale9 for diving into this 🙏

## All changes
* Update librarian to 0.0.9 and switch publication to the Central Portal by @martinbonnin in https://github.com/apollographql/apollo-kotlin-adapters/pull/33
* Remove `KotlinxInstantAdapter` in favor of a new `KotlinInstantAdapter`. by @ychescale9 in https://github.com/apollographql/apollo-kotlin-adapters/pull/32
* Update librarian and use LIBRARIAN_RELEASE by @martinbonnin in https://github.com/apollographql/apollo-kotlin-adapters/pull/34


# Version 0.0.5
_2025-04-29_

* Do not set the license URL in the POMs (#29)

# Version 0.0.4
_2024-09-02_

* Add JavaZonedDateTimeAdapter by @leinardi (#21) (#22)
* Encode BigDecimal as JSON number (#18)
* Update Apollo to 4.0.0 (#17)

# Version 0.0.3
_2024-08-12_

* Add `UnitAdapter` (#14)

# Version 0.0.2
_2024-07-08_

* Update to Apollo Kotlin 4.0.0-rc.1

# Version 0.0.1
_2024-06-28_

Initial release 🎉
