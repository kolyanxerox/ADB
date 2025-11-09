package com.unity3d.ads.core.data.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m13761boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m13762constructorimpl(String data) {
        OooOo.OooO0o0(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13763equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && OooOo.OooO00o(str, ((ImpressionConfig) obj).m13767unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13764equalsimpl0(String str, String str2) {
        return OooOo.OooO00o(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13765hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13766toStringimpl(String str) {
        return OooO00o.OooO0o(')', "ImpressionConfig(data=", str);
    }

    public boolean equals(Object obj) {
        return m13763equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m13765hashCodeimpl(this.data);
    }

    public String toString() {
        return m13766toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m13767unboximpl() {
        return this.data;
    }
}
