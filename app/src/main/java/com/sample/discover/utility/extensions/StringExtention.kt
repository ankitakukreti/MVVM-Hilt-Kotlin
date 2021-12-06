package com.workwin.aurora.utils.extensions

/** Extension fun to check is string is not null and empty*/
fun String?.isValidString():Boolean{
    return this != null && this.isNotEmpty() && !this.equals("null", ignoreCase = true)
}

/** Extension fun to check is string is not null and empty*/
fun String?.isNotNullAndEmpty():Boolean{
    return this!=null && this.isNotBlank()
}

/** Extension fun to check is CharSequence is not null and empty*/
fun CharSequence?.isNotNullAndEmpty():Boolean{
    return this!=null && this.isNotBlank()
}