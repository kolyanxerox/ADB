package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class pz0 extends IOException {
    public /* synthetic */ pz0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pz0(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException, int i2) {
        switch (i2) {
            case 2:
                Locale locale = Locale.US;
                StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "Pos: ", ", limit: ");
                sbOooOOo.append(j2);
                sbOooOOo.append(", len: ");
                sbOooOOo.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbOooOOo.toString()), indexOutOfBoundsException);
                break;
            case 3:
                Locale locale2 = Locale.US;
                StringBuilder sbOooOOo2 = OooO0oO.OooOo.OooOOo(j, "Pos: ", ", limit: ");
                sbOooOOo2.append(j2);
                sbOooOOo2.append(", len: ");
                sbOooOOo2.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbOooOOo2.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale3 = Locale.US;
                StringBuilder sbOooOOo3 = OooO0oO.OooOo.OooOOo(j, "Pos: ", ", limit: ");
                sbOooOOo3.append(j2);
                sbOooOOo3.append(", len: ");
                sbOooOOo3.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbOooOOo3.toString()), indexOutOfBoundsException);
                break;
        }
    }

    public pz0(File file, File file2, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        super(string);
    }

    public pz0(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
