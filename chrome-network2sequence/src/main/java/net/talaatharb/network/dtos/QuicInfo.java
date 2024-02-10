package net.talaatharb.network.dtos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class  QuicInfo{
	@JsonProperty("allow_server_migration")
	private boolean allowServerMigration;
	@JsonProperty("close_sessions_on_ip_change")
	private boolean closeSessionsOnIpChange;
	@JsonProperty("connection_options")
	private ArrayList<Object> connectionOptions;
	@JsonProperty("estimate_initial_rtt")
	private boolean estimateInitialRtt;
	@JsonProperty("goaway_sessions_on_ip_change")
	private boolean goawaySessionsOnIpChange;
	@JsonProperty("idle_connection_timeout_seconds")
	private int idleConnectionTimeoutSeconds;
	@JsonProperty("idle_session_migration_period_seconds")
	private int idleSessionMigrationPeriodSeconds;
	@JsonProperty("initial_rtt_for_handshake_milliseconds")
	private int initialRttForHandshakeMilliseconds;
	@JsonProperty("max_num_migrations_to_non_default_network_on_path_degrading")
	private int maxNumMigrationsToNonDefaultNetworkOnPathDegrading;
	@JsonProperty("max_num_migrations_to_non_default_network_on_write_error")
	private int maxNumMigrationsToNonDefaultNetworkOnWriteError;
	@JsonProperty("max_packet_length")
	private int maxPacketLength;
	@JsonProperty("max_server_configs_stored_in_properties")
	private int maxServerConfigsStoredInProperties;
	@JsonProperty("max_time_on_non_default_network_seconds")
	private int maxTimeOnNonDefaultNetworkSeconds;
	@JsonProperty("migrate_idle_sessions")
	private boolean migrateIdleSessions;
	@JsonProperty("migrate_sessions_early_v2")
	private boolean migrateSessionsEarlyV2;
	@JsonProperty("migrate_sessions_on_network_change_v2")
	private boolean migrateSessionsOnNetworkChangeV2;
	@JsonProperty("origins_to_force_quic_on")
	private ArrayList<Object> originsToForceQuicOn;
	@JsonProperty("quic_enabled")
	private boolean quicEnabled;
	@JsonProperty("reduced_ping_timeout_seconds")
	private int reducedPingTimeoutSeconds;
	@JsonProperty("retransmittable_on_wire_timeout_milliseconds")
	private int retransmittableOnWireTimeoutMilliseconds;
	@JsonProperty("retry_on_alternate_network_before_handshake")
	private boolean retryOnAlternateNetworkBeforeHandshake;
	@JsonProperty("retry_without_alt_svc_on_quic_errors")
	private boolean retryWithoutAltSvcOnQuicErrors;
	private ArrayList<Object> sessions;
	@JsonProperty("supported_versions")
	private ArrayList<String> supportedVersions;
}
