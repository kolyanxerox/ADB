package com.unity3d.ads.injection;

import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0o0o.o0ooOOo;

/* loaded from: classes3.dex */
public final class EntryKey {
    private final o0ooOOo instanceClass;
    private final String named;

    public EntryKey(String named, o0ooOOo instanceClass) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, o0ooOOo o0ooooo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            o0ooooo = entryKey.instanceClass;
        }
        return entryKey.copy(str, o0ooooo);
    }

    public final String component1() {
        return this.named;
    }

    public final o0ooOOo component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, o0ooOOo instanceClass) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return OooOo.OooO00o(this.named, entryKey.named) && OooOo.OooO00o(this.instanceClass, entryKey.instanceClass);
    }

    public final o0ooOOo getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, o0ooOOo o0ooooo, int i, OooOO0O oooOO0O) {
        this((i & 1) != 0 ? "" : str, o0ooooo);
    }
}
