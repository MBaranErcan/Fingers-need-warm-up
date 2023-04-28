/* Write the SQL statements for the following questions:
- List all teams with their names.
- List the teams which have matches as a host team.
- How many teams exist?
- What is the score of the match between Beşiktaş and Liverpool played on ‘20/03/2019’?
- Calculate the total number of matches played at İstanbul.
- Calculate the total goals of one of the teams.
- Calculate the total goals of the teams from İstanbul.
- Calculate the average goals of the teams that they play in their home.



#- List all teams with their names.
	SELECT team_name FROM team

#- List the teams which have matches as a host team.
	SELECT DISTINCT team_name
		FROM team t, match m
			WHERE t.team_name = m.host_team

#- How many teams exist?
	SELECT count(*)
		FROM team t
	
#- What is the score of the match between Beşiktaş and Liverpool played on ‘20/03/2019’?
	SELECT host_goal, guest_goal
		FROM match m
			WHERE m.host_team = 'Beşiktaş'
				 AND m.guest_team = 'Liverpool'
				 AND TO_CHAR (m.match_date, 'DD/MM/YYYY') = '20/03/2019'


#- Calculate the total number of matches played at İstanbul.
	SELECT COUNT(*) 
		FROM Match m, Team t
			WHERE m.HOST_TEAM = t.TEAM_NAME
				AND t.city = 'İstanbul';
                
#- Calculate the total goals of one of the teams
	SELECT SUM(goal)
		FROM (
			SELECT host_goal AS goal
			  FROM Match m
				WHERE m.host_team = 'Beşiktaş'
			UNION
			SELECT guest_goal AS goal
			  FROM Match m
				WHERE m.guest_team = 'Beşiktaş'	);

#- Calculate the total goals of the teams from İstanbul.
	SELECT SUM(goal)
    FROM (
		SELECT HOST_GOAL as goal
			FROM Match m, Team t
				WHERE t.TEAM_NAME = m.HOST_TEAM
					AND t.CITY = 'İstanbul'
		UNION
        SELECT GUEST_GOAL as goal
			FROM Match m, Team t
				WHERE t.TEAM_NAME = m.GUEST_TEAM
					AND t.CITY = 'İstanbul');
                    
#- Calculate the average goals of the teams that they play in their home
	SELECT HOST_TEAM, AVG(HOST_GOAL)
		FROM m.match
	GROUP BY HOST_TEAM
		