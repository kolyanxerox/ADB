package o000Ooo;

import java.util.HashMap;
import org.apache.tika.metadata.MachineMetadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o0OoOo0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ o0OoOo0[] f30518OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final o0OoOo0 f30519OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final HashMap f30520OooOo0o;

    /* JADX INFO: Fake field, exist only in values array */
    o0OoOo0 EF0;

    static {
        o0OoOo0 o0oooo0 = new o0OoOo0("X86_32", 0);
        o0OoOo0 o0oooo02 = new o0OoOo0("X86_64", 1);
        o0OoOo0 o0oooo03 = new o0OoOo0("ARM_UNKNOWN", 2);
        o0OoOo0 o0oooo04 = new o0OoOo0(MachineMetadata.MACHINE_PPC, 3);
        o0OoOo0 o0oooo05 = new o0OoOo0("PPC64", 4);
        o0OoOo0 o0oooo06 = new o0OoOo0("ARMV6", 5);
        o0OoOo0 o0oooo07 = new o0OoOo0("ARMV7", 6);
        o0OoOo0 o0oooo08 = new o0OoOo0("UNKNOWN", 7);
        f30519OooOo0O = o0oooo08;
        o0OoOo0 o0oooo09 = new o0OoOo0("ARMV7S", 8);
        o0OoOo0 o0oooo010 = new o0OoOo0("ARM64", 9);
        f30518OooOo = new o0OoOo0[]{o0oooo0, o0oooo02, o0oooo03, o0oooo04, o0oooo05, o0oooo06, o0oooo07, o0oooo08, o0oooo09, o0oooo010};
        HashMap map = new HashMap(4);
        f30520OooOo0o = map;
        map.put("armeabi-v7a", o0oooo07);
        map.put("armeabi", o0oooo06);
        map.put("arm64-v8a", o0oooo010);
        map.put("x86", o0oooo0);
    }

    public static o0OoOo0 valueOf(String str) {
        return (o0OoOo0) Enum.valueOf(o0OoOo0.class, str);
    }

    public static o0OoOo0[] values() {
        return (o0OoOo0[]) f30518OooOo.clone();
    }
}
