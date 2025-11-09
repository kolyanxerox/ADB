package androidx.window.area;

import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class WindowAreaCapability {
    private final Operation operation;
    private final Status status;

    public static final class Operation {
        private final String description;
        public static final Companion Companion = new Companion(null);
        public static final Operation OPERATION_TRANSFER_ACTIVITY_TO_AREA = new Operation("TRANSFER");
        public static final Operation OPERATION_PRESENT_ON_AREA = new Operation("PRESENT");

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            private Companion() {
            }
        }

        private Operation(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public static final class Status {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final Status WINDOW_AREA_STATUS_UNKNOWN = new Status("UNKNOWN");
        public static final Status WINDOW_AREA_STATUS_UNSUPPORTED = new Status("UNSUPPORTED");
        public static final Status WINDOW_AREA_STATUS_UNAVAILABLE = new Status("UNAVAILABLE");
        public static final Status WINDOW_AREA_STATUS_AVAILABLE = new Status("AVAILABLE");
        public static final Status WINDOW_AREA_STATUS_ACTIVE = new Status("ACTIVE");

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final Status getWINDOW_AREA_STATUS_UNKNOWN$window_release() {
                return Status.WINDOW_AREA_STATUS_UNKNOWN;
            }

            private Companion() {
            }
        }

        private Status(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public WindowAreaCapability(Operation operation, Status status) {
        OooOo.OooO0o0(operation, "operation");
        OooOo.OooO0o0(status, "status");
        this.operation = operation;
        this.status = status;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WindowAreaCapability)) {
            return false;
        }
        WindowAreaCapability windowAreaCapability = (WindowAreaCapability) obj;
        return OooOo.OooO00o(this.operation, windowAreaCapability.operation) && OooOo.OooO00o(this.status, windowAreaCapability.status);
    }

    public final Operation getOperation() {
        return this.operation;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.operation.hashCode() * 31);
    }

    public String toString() {
        return "Operation: " + this.operation + ": Status: " + this.status;
    }
}
