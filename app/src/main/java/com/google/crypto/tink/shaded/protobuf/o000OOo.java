package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class o000OOo extends IOException {

    /* renamed from: OooOo0O */
    public boolean f28100OooOo0O;

    public static o000OOo OooO00o() {
        return new o000OOo("Protocol message contained an invalid tag (zero).");
    }

    public static o000OOo OooO0O0() {
        return new o000OOo("Protocol message had invalid UTF-8.");
    }

    public static o0O0O00 OooO0OO() {
        return new o0O0O00("Protocol message tag had invalid wire type.");
    }

    public static o000OOo OooO0o() {
        return new o000OOo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static o000OOo OooO0o0() {
        return new o000OOo("CodedInputStream encountered a malformed varint.");
    }

    public static o000OOo OooO0oO() {
        return new o000OOo("Failed to parse the message.");
    }

    public static o000OOo OooO0oo() {
        return new o000OOo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
