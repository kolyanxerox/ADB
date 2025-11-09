package org.apache.tika.exception;

import OooO0oO.OooOo;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j, long j2) {
        return OooOo.OooOOOO(OooOo.OooOOo(j, "File is ", " bytes, but "), j2, " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.");
    }

    public FileTooLongException(long j, long j2) {
        super(msg(j, j2));
    }
}
