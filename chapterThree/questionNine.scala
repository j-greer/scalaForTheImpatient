/*
Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
Strip off the "America/" prefix and sort the result.
 */

import java.util.TimeZone.getAvailableIDs

getAvailableIDs.filter(x => x.contains("America"))
               .map( _.replaceAll("America/", ""))