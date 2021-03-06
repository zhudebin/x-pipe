package com.ctrip.xpipe.redis.console;


import com.ctrip.xpipe.redis.console.cluster.ConsoleCrossDcServerTest;
import com.ctrip.xpipe.redis.console.config.impl.DefaultConsoleDbConfigTest;
import com.ctrip.xpipe.redis.console.controller.api.data.meta.ClusterCreateInfoTest;
import com.ctrip.xpipe.redis.console.dao.ConfigDaoTest;
import com.ctrip.xpipe.redis.console.dao.MigrationClusterDaoTest;
import com.ctrip.xpipe.redis.console.dao.MigrationEventDaoTest;
import com.ctrip.xpipe.redis.console.health.action.HealthStatusTest;
import com.ctrip.xpipe.redis.console.health.sentinel.DefaultSentinelCollectorTest;
import com.ctrip.xpipe.redis.console.health.sentinel.SentinelHelloTest;
import com.ctrip.xpipe.redis.console.migration.MultiShardMigrationTest;
import com.ctrip.xpipe.redis.console.migration.SingleShardMigrationTest;
import com.ctrip.xpipe.redis.console.migration.model.DefaultMigrationClusterTest;
import com.ctrip.xpipe.redis.console.migration.model.DefaultMigrationShardTest;
import com.ctrip.xpipe.redis.console.migration.model.impl.DefaultShardMigrationResultTest;
import com.ctrip.xpipe.redis.console.migration.status.migration.MigrationCheckingStateTest;
import com.ctrip.xpipe.redis.console.migration.status.migration.MigrationInitiatedStateTest;
import com.ctrip.xpipe.redis.console.migration.status.migration.MigrationPartialSuccessStateTest;
import com.ctrip.xpipe.redis.console.migration.status.migration.MigrationPublishStatTest;
import com.ctrip.xpipe.redis.console.migration.status.MigrationStatTest;
import com.ctrip.xpipe.redis.console.migration.status.MigrationStatusTest;

import com.ctrip.xpipe.redis.console.service.impl.KeepercontainerServiceImplTest;
import com.ctrip.xpipe.redis.console.service.impl.RedisServiceImplTest;
import com.ctrip.xpipe.redis.console.service.impl.SentinelServiceImplTest;
import com.ctrip.xpipe.redis.console.service.impl.ShardServiceImplTest;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ctrip.xpipe.redis.console.dal.ConcurrentDalTransactionTest;
import com.ctrip.xpipe.redis.console.dal.DalTransactionManagerTest;
import com.ctrip.xpipe.redis.console.notifier.ClusterMetaModifiedNotifierTest;
import com.ctrip.xpipe.redis.console.notifier.MetaNotifyTaskTest;
import com.ctrip.xpipe.redis.console.service.MetaServiceTest;
import com.ctrip.xpipe.redis.console.service.meta.impl.ClusterMetaServiceImplTest;

import org.junit.runner.RunWith;

/**
 * @author wenchao.meng
 *         <p>
 *         Jun 23, 2016
 */
@RunWith(Suite.class)
@SuiteClasses({
        SentinelHelloTest.class,
        DefaultSentinelCollectorTest.class,
        ConsoleCrossDcServerTest.class,
        HealthStatusTest.class,
        RedisServiceImplTest.class,
        KeepercontainerServiceImplTest.class,
        ShardServiceImplTest.class,
        MigrationStatusTest.class,
        SentinelServiceImplTest.class,
        ClusterMetaServiceImplTest.class,
        ConcurrentDalTransactionTest.class,
        DalTransactionManagerTest.class,
        ClusterMetaModifiedNotifierTest.class,
        MetaServiceTest.class,
        ClusterMetaModifiedNotifierTest.class,
        MetaNotifyTaskTest.class,
        MigrationCheckingStateTest.class,
        MigrationPartialSuccessStateTest.class,
        DefaultMigrationClusterTest.class,
        DefaultMigrationShardTest.class,
        MigrationStatTest.class,
        MigrationInitiatedStateTest.class,
        MigrationPublishStatTest.class,
        SingleShardMigrationTest.class,
        MultiShardMigrationTest.class,
        DefaultShardMigrationResultTest.class,
        ClusterCreateInfoTest.class,
        ConfigDaoTest.class,
        MigrationClusterDaoTest.class,
        MigrationEventDaoTest.class,
        DefaultConsoleDbConfigTest.class
})
public class AllTests {

}
