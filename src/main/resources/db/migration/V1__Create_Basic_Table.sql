-- auto-generated definition
create table event
(
  id     uuid not null
    constraint event_pkey
      primary key,
  action varchar(255)
);

-- auto-generated definition
create table issue
(
  id                 uuid not null
    constraint issue_pkey
      primary key,
  author_association varchar(255),
  closed_at          varchar(255),
  comments           integer,
  comments_url       varchar(255),
  created_at         varchar(255),
  events_url         varchar(255),
  git_hub_id         integer,
  labels_url         varchar(255),
  node_id            varchar(255),
  number             integer,
  repository_url     varchar(255),
  state              varchar(255),
  title              varchar(255),
  updated_at         varchar(255),
  url                varchar(255),
  event_id           uuid
    constraint fks1ntv3i937ba8b9g52m25q6xk
      references event
);

-- auto-generated definition
create table contributor
(
  id                  uuid not null
    constraint contributor_pkey
      primary key,
  avatar_url          varchar(255),
  events_url          varchar(255),
  followers_url       varchar(255),
  following_url       varchar(255),
  gists_url           varchar(255),
  git_hub_id          integer,
  login               varchar(255),
  node_id             varchar(255),
  organizations_url   varchar(255),
  received_events_url varchar(255),
  repos_url           varchar(255),
  site_admin          boolean,
  starred_url         varchar(255),
  subscriptions_url   varchar(255),
  type                varchar(255),
  url                 varchar(255),
  issue_id            uuid
    constraint fkgbqghqoclx6talu9gr7qkbvkj
      references issue
);

alter table contributor
  owner to sa;

alter table issue
  owner to sa;

alter table event
  owner to sa;